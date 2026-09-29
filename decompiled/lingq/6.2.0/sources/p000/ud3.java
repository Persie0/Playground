package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$styleable;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0639g;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: loaded from: classes.dex */
public final class ud3 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0638f f63753a;

    public ud3(AbstractC0638f abstractC0638f) {
        this.f63753a = abstractC0638f;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0639g c0639gM2166g;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC0638f abstractC0638f = this.f63753a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC0638f);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(R$styleable.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0635c.class.isAssignableFrom(de3.m10307b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = resourceId != -1 ? abstractC0638f.m2136D(resourceId) : null;
                    if (abstractComponentCallbacksC0635cM2136D == null && string != null) {
                        abstractComponentCallbacksC0635cM2136D = abstractC0638f.m2137E(string);
                    }
                    if (abstractComponentCallbacksC0635cM2136D == null && id != -1) {
                        abstractComponentCallbacksC0635cM2136D = abstractC0638f.m2136D(id);
                    }
                    if (abstractComponentCallbacksC0635cM2136D == null) {
                        de3 de3VarM2140I = abstractC0638f.m2140I();
                        context.getClassLoader();
                        abstractComponentCallbacksC0635cM2136D = de3VarM2140I.m10309a(attributeValue);
                        abstractComponentCallbacksC0635cM2136D.f5668J = true;
                        abstractComponentCallbacksC0635cM2136D.f5678T = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0635cM2136D.f5679U = id;
                        abstractComponentCallbacksC0635cM2136D.f5680V = string;
                        abstractComponentCallbacksC0635cM2136D.f5669K = true;
                        abstractComponentCallbacksC0635cM2136D.f5674P = abstractC0638f;
                        hd3 hd3Var = abstractC0638f.f5763x;
                        abstractComponentCallbacksC0635cM2136D.f5675Q = hd3Var;
                        abstractComponentCallbacksC0635cM2136D.mo2079F(hd3Var.f42210L, attributeSet, abstractComponentCallbacksC0635cM2136D.f5687b);
                        c0639gM2166g = abstractC0638f.m2154a(abstractComponentCallbacksC0635cM2136D);
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0635cM2136D + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0635cM2136D.f5669K) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0635cM2136D.f5669K = true;
                        abstractComponentCallbacksC0635cM2136D.f5674P = abstractC0638f;
                        hd3 hd3Var2 = abstractC0638f.f5763x;
                        abstractComponentCallbacksC0635cM2136D.f5675Q = hd3Var2;
                        abstractComponentCallbacksC0635cM2136D.mo2079F(hd3Var2.f42210L, attributeSet, abstractComponentCallbacksC0635cM2136D.f5687b);
                        c0639gM2166g = abstractC0638f.m2166g(abstractComponentCallbacksC0635cM2136D);
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0635cM2136D + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    rf3 rf3Var = sf3.f60790a;
                    sf3.m21333b(new FragmentTagUsageViolation(abstractComponentCallbacksC0635cM2136D, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0635cM2136D + " to container " + viewGroup));
                    sf3.m21332a(abstractComponentCallbacksC0635cM2136D).getClass();
                    FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
                    abstractComponentCallbacksC0635cM2136D.f5690c0 = viewGroup;
                    c0639gM2166g.m2202k();
                    c0639gM2166g.m2201j();
                    View view2 = abstractComponentCallbacksC0635cM2136D.f5692d0;
                    if (view2 == null) {
                        C3386nv.m17633t(wq1.m24118n("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0635cM2136D.f5692d0.getTag() == null) {
                        abstractComponentCallbacksC0635cM2136D.f5692d0.setTag(string);
                    }
                    abstractComponentCallbacksC0635cM2136D.f5692d0.addOnAttachStateChangeListener(new td3(this, c0639gM2166g));
                    return abstractComponentCallbacksC0635cM2136D.f5692d0;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
