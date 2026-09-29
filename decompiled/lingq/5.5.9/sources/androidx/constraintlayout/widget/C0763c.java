package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p143h2.C5881d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0763c extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public C0762b f5506a;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a */
    public static class a extends ConstraintLayout.C0759b {

        /* JADX INFO: renamed from: A0 */
        public final float f5507A0;

        /* JADX INFO: renamed from: B0 */
        public final float f5508B0;

        /* JADX INFO: renamed from: C0 */
        public final float f5509C0;

        /* JADX INFO: renamed from: D0 */
        public final float f5510D0;

        /* JADX INFO: renamed from: r0 */
        public final float f5511r0;

        /* JADX INFO: renamed from: s0 */
        public final boolean f5512s0;

        /* JADX INFO: renamed from: t0 */
        public final float f5513t0;

        /* JADX INFO: renamed from: u0 */
        public final float f5514u0;

        /* JADX INFO: renamed from: v0 */
        public final float f5515v0;

        /* JADX INFO: renamed from: w0 */
        public final float f5516w0;

        /* JADX INFO: renamed from: x0 */
        public final float f5517x0;

        /* JADX INFO: renamed from: y0 */
        public final float f5518y0;

        /* JADX INFO: renamed from: z0 */
        public final float f5519z0;

        public a() {
            this.f5511r0 = 1.0f;
            this.f5512s0 = false;
            this.f5513t0 = 0.0f;
            this.f5514u0 = 0.0f;
            this.f5515v0 = 0.0f;
            this.f5516w0 = 0.0f;
            this.f5517x0 = 1.0f;
            this.f5518y0 = 1.0f;
            this.f5519z0 = 0.0f;
            this.f5507A0 = 0.0f;
            this.f5508B0 = 0.0f;
            this.f5509C0 = 0.0f;
            this.f5510D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5511r0 = 1.0f;
            this.f5512s0 = false;
            this.f5513t0 = 0.0f;
            this.f5514u0 = 0.0f;
            this.f5515v0 = 0.0f;
            this.f5516w0 = 0.0f;
            this.f5517x0 = 1.0f;
            this.f5518y0 = 1.0f;
            this.f5519z0 = 0.0f;
            this.f5507A0 = 0.0f;
            this.f5508B0 = 0.0f;
            this.f5509C0 = 0.0f;
            this.f5510D0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35170d);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f5511r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5511r0);
                } else if (index == 28) {
                    this.f5513t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5513t0);
                    this.f5512s0 = true;
                } else if (index == 23) {
                    this.f5515v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5515v0);
                } else if (index == 24) {
                    this.f5516w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5516w0);
                } else if (index == 22) {
                    this.f5514u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5514u0);
                } else if (index == 20) {
                    this.f5517x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5517x0);
                } else if (index == 21) {
                    this.f5518y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5518y0);
                } else if (index == 16) {
                    this.f5519z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5519z0);
                } else if (index == 17) {
                    this.f5507A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5507A0);
                } else if (index == 18) {
                    this.f5508B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5508B0);
                } else if (index == 19) {
                    this.f5509C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5509C0);
                } else if (index == 27) {
                    this.f5510D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5510D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0759b(layoutParams);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0762b getConstraintSet() {
        if (this.f5506a == null) {
            this.f5506a = new C0762b();
        }
        C0762b c0762b = this.f5506a;
        c0762b.getClass();
        int childCount = getChildCount();
        HashMap<Integer, C0762b.a> map = c0762b.f5382f;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c0762b.f5381e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new C0762b.a());
            }
            C0762b.a aVar2 = map.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof AbstractC0761a) {
                    AbstractC0761a abstractC0761a = (AbstractC0761a) childAt;
                    aVar2.m2903d(id2, aVar);
                    if (abstractC0761a instanceof Barrier) {
                        C0762b.b bVar = aVar2.f5387e;
                        bVar.f5447i0 = 1;
                        Barrier barrier = (Barrier) abstractC0761a;
                        bVar.f5443g0 = barrier.getType();
                        bVar.f5449j0 = barrier.getReferencedIds();
                        bVar.f5445h0 = barrier.getMargin();
                    }
                }
                aVar2.m2903d(id2, aVar);
            }
        }
        return this.f5506a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
