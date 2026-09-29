package p000;

import android.animation.Animator;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class qy7 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderProgressBar f58393b;

    public /* synthetic */ qy7(ReaderProgressBar readerProgressBar, int i) {
        this.f58392a = i;
        this.f58393b = readerProgressBar;
    }

    /* JADX INFO: renamed from: a */
    private final void m20199a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m20200b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m20201c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m20202d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m20203e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m20204f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m20205g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m20206h(Animator animator) {
    }

    /* JADX INFO: renamed from: i */
    private final void m20207i(Animator animator) {
    }

    /* JADX INFO: renamed from: j */
    private final void m20208j(Animator animator) {
    }

    /* JADX INFO: renamed from: k */
    private final void m20209k(Animator animator) {
    }

    /* JADX INFO: renamed from: l */
    private final void m20210l(Animator animator) {
    }

    /* JADX INFO: renamed from: m */
    private final void m20211m(Animator animator) {
    }

    /* JADX INFO: renamed from: n */
    private final void m20212n(Animator animator) {
    }

    /* JADX INFO: renamed from: o */
    private final void m20213o(Animator animator) {
    }

    /* JADX INFO: renamed from: p */
    private final void m20214p(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f58392a;
        ReaderProgressBar readerProgressBar = this.f58393b;
        switch (i) {
            case 0:
                readerProgressBar.f30431g0 = false;
                break;
            case 1:
                break;
            case 2:
                readerProgressBar.f30435i0 = null;
                break;
            case 3:
                break;
            case 4:
                int i2 = ReaderProgressBar.f30401n0;
                readerProgressBar.m9424f(true);
                break;
            default:
                readerProgressBar.f30429f0 = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f58392a;
        ReaderProgressBar readerProgressBar = this.f58393b;
        switch (i) {
            case 0:
                break;
            case 1:
                readerProgressBar.f30431g0 = false;
                break;
            case 2:
                break;
            case 3:
                readerProgressBar.f30435i0 = null;
                break;
            case 4:
                int i2 = ReaderProgressBar.f30401n0;
                readerProgressBar.m9424f(true);
                break;
            default:
                readerProgressBar.f30429f0 = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f58392a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f58392a;
    }
}
