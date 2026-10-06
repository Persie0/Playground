package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.C1148yj;
import p000.C1152yn;
import p000.C1176zk;
import p000.aad;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class Barrier extends C1176zk {

    /* JADX INFO: renamed from: a */
    public int f1443a;

    /* JADX INFO: renamed from: b */
    public C1148yj f1444b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // p000.C1176zk
    /* JADX INFO: renamed from: a */
    protected final void mo1403a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aad.f2b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.f48362f = typedArrayObtainStyledAttributes.getString(35);
                    m19793e(this.f48362f);
                } else if (index == 36) {
                    this.f48363g = typedArrayObtainStyledAttributes.getString(36);
                    m19794f(this.f48363g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1444b = new C1148yj();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, aad.f2b);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    this.f1443a = typedArrayObtainStyledAttributes2.getInt(26, 0);
                } else if (index2 == 25) {
                    this.f1444b.f48143b = typedArrayObtainStyledAttributes2.getBoolean(25, true);
                } else if (index2 == 27) {
                    this.f1444b.f48144c = typedArrayObtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f48365i = this.f1444b;
        m19796h();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @Override // p000.C1176zk
    /* JADX INFO: renamed from: b */
    public final void mo1404b(C1152yn c1152yn, boolean z) {
        int i = this.f1443a;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (c1152yn instanceof C1148yj) {
            ((C1148yj) c1152yn).f48142a = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1405c(int i) {
        this.f1444b.f48144c = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
