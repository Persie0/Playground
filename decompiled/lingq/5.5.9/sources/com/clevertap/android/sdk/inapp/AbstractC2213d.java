package com.clevertap.android.sdk.inapp;

import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0979t;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;
import java.lang.ref.WeakReference;
import p290o6.C7979r0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2213d extends AbstractC2211c {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CloseImageView f11188a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RelativeLayout f11189b;

        public a(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            this.f11188a = closeImageView;
            this.f11189b = relativeLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CloseImageView closeImageView = this.f11188a;
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            RelativeLayout relativeLayout = this.f11189b;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m6518s0(RelativeLayout relativeLayout, CloseImageView closeImageView) {
        new Handler().post(new a(closeImageView, relativeLayout));
    }

    /* JADX INFO: renamed from: u0 */
    public static void m6519u0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c
    /* JADX INFO: renamed from: m0 */
    public void mo6512m0() {
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c
    /* JADX INFO: renamed from: p0 */
    public final void mo6515p0() {
        Object obj = this.f11184x0;
        if (obj instanceof InAppNotificationActivity) {
            this.f11180B0 = new WeakReference<>((InterfaceC2222h0) obj);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m6520t0() {
        ActivityC0979t activityC0979tM3582e = m3582e();
        boolean z10 = C7979r0.f43406a;
        boolean z11 = true;
        if (activityC0979tM3582e != null && !activityC0979tM3582e.isFinishing() && !activityC0979tM3582e.isDestroyed()) {
            z11 = false;
        }
        if (z11) {
            return false;
        }
        try {
            return m3599s().getBoolean(R.bool.ctIsTablet);
        } catch (Exception e10) {
            C2181a.m6449a("Failed to decide whether device is a smart phone or tablet!");
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m6521v0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        layoutParams.setMargins(m6517r0(140), m6517r0(140), m6517r0(140), m6517r0(140));
        int measuredWidth = relativeLayout.getMeasuredWidth() - m6517r0(210);
        layoutParams.width = measuredWidth;
        layoutParams.height = (int) (measuredWidth * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m6522w0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int measuredWidth = (int) ((relativeLayout.getMeasuredWidth() - m6517r0(200)) * 1.78f);
        int measuredHeight = frameLayout.getMeasuredHeight() - m6517r0(280);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
            layoutParams.width = relativeLayout.getMeasuredWidth() - m6517r0(200);
        }
        layoutParams.setMargins(m6517r0(140), m6517r0(140), m6517r0(140), m6517r0(140));
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m6523x0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int measuredWidth = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
        int measuredHeight = frameLayout.getMeasuredHeight() - m6517r0(80);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
        }
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m6524y0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int measuredHeight = (int) ((relativeLayout.getMeasuredHeight() - m6517r0(120)) * 1.78f);
        int measuredWidth = frameLayout.getMeasuredWidth() - m6517r0(280);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
            layoutParams.height = relativeLayout.getMeasuredHeight() - m6517r0(120);
        }
        layoutParams.setMargins(m6517r0(140), m6517r0(100), m6517r0(140), m6517r0(100));
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6525z0(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int measuredHeight = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
        int measuredWidth = frameLayout.getMeasuredWidth() - m6517r0(80);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
        }
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        m6518s0(relativeLayout, closeImageView);
    }
}
