package cn.coderdream.anim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MAnim {
    private static MAnim mAnim;
    private static List<Map<String, Object>> mList = null;

    public interface MAnimListener {
        void onMAnimEnd();
    }

    public static MAnim getInstance() {
        if (mAnim == null) {
            mAnim = new MAnim();
        }
        if (mList == null) {
            mList = new ArrayList<>();
        }
        mList.clear();
        return mAnim;
    }

    public class with {
        private View mView;
        private boolean isloop;

        public with(View view) {
            this.mView = view;
        }

        public with scaleXY(long duration, float... values) {
            return scaleXY(0, duration, values);
        }

        public with scaleXY(long waitTime, long duration, float... values) {
            ObjectAnimator scaleX = ObjectAnimator.ofFloat(mView, "scaleX", values);
            ObjectAnimator scaleY = ObjectAnimator.ofFloat(mView, "scaleY", values);
            scaleX.setDuration(duration);
            scaleY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(scaleX, scaleY);

            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with scaleY(long duration, float... values) {
            return scaleY(0, duration, values);
        }

        public with scaleY(long waitTime, long duration, float... values) {
            ObjectAnimator scaleY = ObjectAnimator.ofFloat(mView, "scaleY", values);
            scaleY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(scaleY);

            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with scaleX(long duration, float... values) {
            return scaleX(0, duration, values);
        }

        public with scaleX(long waitTime, long duration, float... values) {
            ObjectAnimator scaleX = ObjectAnimator.ofFloat(mView, "scaleX", values);
            scaleX.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(scaleX);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with call(MAnimListener listener) {
            Map<String, Object> map = new HashMap<>();
            map.put("type", 2);
            map.put("listener", listener);
            mList.add(map);
            return this;
        }

        public with alpha(long duration, float... values) {
            return alpha(0, duration, values);
        }

        public with alpha(long waitTime, long duration, float... values) {
            ObjectAnimator alpha = ObjectAnimator.ofFloat(mView, "alpha", values);
            alpha.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(alpha);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with translationX(long duration, float... values) {
            return translationX(0, duration, values);
        }

        public with translationX(long waitTime, long duration, float... values) {
            ObjectAnimator translationX = ObjectAnimator.ofFloat(mView, "translationX", values);
            translationX.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(translationX);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with translationY(long duration, float... values) {
            return translationY(0, duration, values);
        }

        public with translationY(long waitTime, long duration, float... values) {
            ObjectAnimator translationY = ObjectAnimator.ofFloat(mView, "translationY", values);
            translationY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(translationY);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with translationXY(long duration, float... values) {
            return translationXY(0, duration, values);
        }

        public with translationXY(long waitTime, long duration, float... values) {
            ObjectAnimator translationX = ObjectAnimator.ofFloat(mView, "translationX", values);
            ObjectAnimator translationY = ObjectAnimator.ofFloat(mView, "translationY", values);
            translationX.setDuration(duration);
            translationY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(translationX, translationY);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with translationYX(long duration, float... values) {
            return translationYX(0, duration, values);
        }

        public with translationYX(long waitTime, long duration, float... values) {

            float[] clone = values.clone();
            for (int i = 0; i < clone.length; i++) {
                clone[i] = clone[i] * (-1);
            }

            ObjectAnimator translationX = ObjectAnimator.ofFloat(mView, "translationX", values);
            ObjectAnimator translationY = ObjectAnimator.ofFloat(mView, "translationY", clone);
            translationX.setDuration(duration);
            translationY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(translationX, translationY);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with rotationX(long duration, float... values) {
            return rotationX(0, duration, values);
        }

        public with rotationX(long waitTime, long duration, float... values) {
            ObjectAnimator rotationX = ObjectAnimator.ofFloat(mView, "rotationX", values);
            rotationX.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(rotationX);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with rotationY(long duration, float... values) {
            return rotationY(0, duration, values);
        }

        public with rotationY(long waitTime, long duration, float... values) {
            ObjectAnimator rotationY = ObjectAnimator.ofFloat(mView, "rotationY", values);
            rotationY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(rotationY);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with rotationXY(long duration, float... values) {
            return rotationXY(0, duration, values);
        }

        public with rotationXY(long waitTime, long duration, float... values) {
            ObjectAnimator rotationX = ObjectAnimator.ofFloat(mView, "rotationX", values);
            ObjectAnimator rotationY = ObjectAnimator.ofFloat(mView, "rotationY", values);
            rotationX.setDuration(duration);
            rotationY.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.playTogether(rotationX, rotationY);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public with rotation(long duration, float... values) {
            return rotation(0, duration, values);
        }

        public with rotation(long waitTime, long duration, float... values) {
            ObjectAnimator rotation = ObjectAnimator.ofFloat(mView, "rotation", values);
            rotation.setDuration(duration);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(waitTime);
            animatorSet.play(rotation);
            Map<String, Object> map = new HashMap<>();
            map.put("type", 1);
            map.put("anim", animatorSet);
            mList.add(map);
            return this;
        }

        public void start() {

            if (mList != null && mList.size() > 0) {
                Map<String, Object> objectMap = mList.get(0);
                int type = (int) objectMap.get("type");
                if (type == 1) {
                    AnimatorSet animatorSet = (AnimatorSet) objectMap.get("anim");
                    if (animatorSet != null) {
                        animatorSet.start();
                        animatorSet.addListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                if (mList.size() > 0) {
                                    mList.remove(0);
                                }
                                start();
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {
                            }
                        });
                    }
                } else if (type == 2) {
                    MAnimListener listener = (MAnimListener) objectMap.get("listener");
                    if (listener != null) {
                        listener.onMAnimEnd();
                    }
                    if (mList.size() > 0) {
                        mList.remove(0);
                    }
                    start();
                }
            }
        }
    }
}
