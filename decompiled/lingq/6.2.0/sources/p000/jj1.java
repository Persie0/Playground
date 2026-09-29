package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jj1 {

    /* JADX INFO: renamed from: a */
    public final int f45601a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f45602b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f45603c;

    /* JADX INFO: renamed from: d */
    public final sj1 f45604d;

    public jj1(Context context, XmlResourceParser xmlResourceParser) {
        this.f45603c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.State_android_id) {
                this.f45601a = typedArrayObtainStyledAttributes.getResourceId(index, this.f45601a);
            } else if (index == R$styleable.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f45603c);
                this.f45603c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    sj1 sj1Var = new sj1();
                    this.f45604d = sj1Var;
                    sj1Var.m21410e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m14493a(kj1 kj1Var) {
        this.f45602b.add(kj1Var);
    }

    /* JADX INFO: renamed from: b */
    public final int m14494b(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f45602b;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((kj1) arrayList.get(i)).m15267a(f, f2)) {
                return i;
            }
            i++;
        }
    }
}
