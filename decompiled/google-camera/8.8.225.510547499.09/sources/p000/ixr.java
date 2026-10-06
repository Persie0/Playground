package p000;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixr extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public CenteredRecyclerView f32601a;

    /* JADX INFO: renamed from: b */
    public int f32602b;

    /* JADX INFO: renamed from: c */
    public nax f32603c;

    /* JADX INFO: renamed from: d */
    private Handler f32604d;

    /* JADX INFO: renamed from: e */
    private final Runnable f32605e;

    public ixr(int i) {
        super(i);
        this.f32605e = new ith(this, 3);
    }

    /* JADX INFO: renamed from: bt */
    private final int m11867bt(int i, C0826ml c0826ml) {
        CenteredRecyclerView centeredRecyclerView;
        if (i == 0 || c0826ml.m16585a() == 0 || c0826ml.f40930o != 0 || c0826ml.f40931p != 0 || (centeredRecyclerView = this.f32601a) == null) {
            return i;
        }
        if (c0826ml.m16585a() == 1) {
            return i / 2;
        }
        View viewMo1153M = mo1153M(0);
        int iM4607a = centeredRecyclerView.m4607a(viewMo1153M) - i;
        View viewMo1153M2 = mo1153M(c0826ml.m16585a() - 1);
        return ((viewMo1153M == null || iM4607a < 0) && (viewMo1153M2 == null || centeredRecyclerView.m4607a(viewMo1153M2) - i > 0)) ? i : i / 2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: C */
    public final int mo1143C(C0826ml c0826ml) {
        if (m16164aj() == 0 || c0826ml.m16585a() == 0) {
            return 0;
        }
        View viewM16174av = m16174av(0);
        View viewM16174av2 = m16174av(m16164aj() - 1);
        if (viewM16174av == null || viewM16174av2 == null) {
            return 0;
        }
        return Math.min(this.f39544B, m16140bo(viewM16174av2) - m16143br(viewM16174av));
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: O */
    protected final void mo1155O(C0826ml c0826ml, int[] iArr) {
        int i = this.f32602b;
        if (c0826ml.m16587c()) {
            super.mo1155O(c0826ml, iArr);
            return;
        }
        int iMax = Math.max(i, Math.max(m16170aq(), m16172as()));
        int iMax2 = Math.max(i, Math.max(m16171ar(), m16169ap()));
        iArr[0] = iMax;
        iArr[1] = iMax2;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: a */
    public final int mo1093a(C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 1) {
            return 1;
        }
        return c0826ml.m16585a();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aH */
    public final void mo11868aH(RecyclerView recyclerView) {
        if (recyclerView instanceof CenteredRecyclerView) {
            this.f32601a = (CenteredRecyclerView) recyclerView;
            this.f32604d = new Handler();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: ag */
    public final void mo1173ag(RecyclerView recyclerView) {
        this.f32601a = null;
        this.f32604d = null;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: b */
    public final int mo1094b(C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 1) {
            return c0826ml.m16585a();
        }
        return 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: bg */
    public final int mo11869bg() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final void m11870c() {
        nax naxVar = this.f32603c;
        if (naxVar != null) {
            for (int i = 0; i < m16164aj(); i++) {
                View viewM16174av = m16174av(i);
                if (viewM16174av != null && this.f1048i != 0) {
                    float f = this.f39544B;
                    int height = viewM16174av.getHeight();
                    int width = viewM16174av.getWidth();
                    float f2 = f / 2.0f;
                    float f3 = height;
                    float f4 = f3 / 2.0f;
                    float top = f2 - (((viewM16174av.getTop() + viewM16174av.getBottom()) / 2.0f) + viewM16174av.getTranslationY());
                    float fAbs = Math.abs(top) / (f2 + f4);
                    Context context = viewM16174av.getContext();
                    if (naxVar.f41919a == null) {
                        naxVar.f41919a = AnimationUtils.loadInterpolator(context, C0100R.anim.wear_picker_skew_interpolator);
                    }
                    float interpolation = (naxVar.f41919a.getInterpolation(1.0f - aax.m70e(fAbs, 1.0f)) * 0.55f) + 0.45f;
                    if (interpolation == 1.0f) {
                        viewM16174av.resetPivot();
                    } else {
                        viewM16174av.setPivotY(aax.m70e(f4 + top, f3));
                        viewM16174av.setPivotX(width / 2.0f);
                    }
                    viewM16174av.setScaleX(interpolation);
                    viewM16174av.setScaleY(interpolation);
                }
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: d */
    public final int mo1096d(int i, C0818md c0818md, C0826ml c0826ml) {
        int iMo1096d = super.mo1096d(m11867bt(i, c0826ml), c0818md, c0826ml);
        if (this.f1048i == 0) {
            m11870c();
        }
        return iMo1096d;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: e */
    public final int mo1097e(int i, C0818md c0818md, C0826ml c0826ml) {
        int iMo1097e = super.mo1097e(m11867bt(i, c0826ml), c0818md, c0826ml);
        if (this.f1048i == 1) {
            m11870c();
        }
        return iMo1097e;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: p */
    public final void mo1108p(C0826ml c0826ml) {
        super.mo1108p(c0826ml);
        Handler handler = this.f32604d;
        if (handler != null) {
            handler.removeCallbacks(this.f32605e);
            handler.postAtFrontOfQueue(this.f32605e);
        }
    }
}
