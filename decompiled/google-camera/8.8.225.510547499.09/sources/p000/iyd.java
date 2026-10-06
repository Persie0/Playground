package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyd implements iyb {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f32636a;

    public iyd(int i) {
        this.f32636a = i;
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: h */
    public final boolean mo11896h(RecyclerView recyclerView) {
        switch (this.f32636a) {
            default:
                if (recyclerView.computeHorizontalScrollRange() <= (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) {
                    return false;
                }
            case 0:
                return true;
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: a */
    public final float mo11889a(View view) {
        switch (this.f32636a) {
            case 0:
                return view.getTranslationY();
            default:
                return view.getTranslationX();
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: b */
    public final int mo11890b(View view) {
        switch (this.f32636a) {
            case 0:
                return (view.getTop() + view.getBottom()) / 2;
            default:
                return (view.getLeft() + view.getRight()) / 2;
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: c */
    public final int mo11891c(View view) {
        switch (this.f32636a) {
            case 0:
                return view.getPaddingTop();
            default:
                return view.getPaddingLeft();
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: d */
    public final int mo11892d(View view) {
        switch (this.f32636a) {
            case 0:
                return view.getHeight();
            default:
                return view.getWidth();
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: e */
    public final void mo11893e(RecyclerView recyclerView, int i) {
        switch (this.f32636a) {
            case 0:
                recyclerView.m1213L(i);
                break;
            default:
                recyclerView.m1212K(i);
                break;
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: f */
    public final void mo11894f(View view, int i) {
        switch (this.f32636a) {
            case 0:
                view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), Math.max(0, Math.min((view.getHeight() - i) - 1, i)));
                break;
            default:
                view.setPadding(i, view.getPaddingTop(), Math.max(0, Math.min((view.getWidth() - i) - 1, i)), view.getPaddingBottom());
                break;
        }
    }

    @Override // p000.iyb
    /* JADX INFO: renamed from: g */
    public final boolean mo11895g(View view) {
        switch (this.f32636a) {
            case 0:
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                return layoutParams != null && layoutParams.height == -1;
            default:
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                return layoutParams2 != null && layoutParams2.width == -1;
        }
    }
}
