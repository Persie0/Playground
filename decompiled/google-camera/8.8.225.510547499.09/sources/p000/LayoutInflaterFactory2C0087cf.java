package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: cf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0087cf implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final C0111cq f5491a;

    public LayoutInflaterFactory2C0087cf(C0111cq c0111cq) {
        this.f5491a = c0111cq;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        jew jewVarM5319ad;
        if (C0084cc.class.getName().equals(str)) {
            return new C0084cc(context, attributeSet, this.f5491a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0047at.f2284a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            int i = C0085cd.f5249a;
            try {
                if (ComponentCallbacksC0077bw.class.isAssignableFrom(C0085cd.m3475a(classLoader, attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1) {
                        if (resourceId != -1) {
                            id = -1;
                        } else {
                            if (string == null) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                            }
                            id = -1;
                            resourceId = -1;
                        }
                    }
                    ComponentCallbacksC0077bw componentCallbacksC0077bwM5324d = resourceId != -1 ? this.f5491a.m5324d(resourceId) : null;
                    if (componentCallbacksC0077bwM5324d == null && string != null) {
                        componentCallbacksC0077bwM5324d = this.f5491a.m5325e(string);
                    }
                    if (componentCallbacksC0077bwM5324d == null && id != -1) {
                        componentCallbacksC0077bwM5324d = this.f5491a.m5324d(id);
                    }
                    if (componentCallbacksC0077bwM5324d == null) {
                        C0085cd c0085cdM5326h = this.f5491a.m5326h();
                        context.getClassLoader();
                        componentCallbacksC0077bwM5324d = c0085cdM5326h.mo3476b(attributeValue);
                        componentCallbacksC0077bwM5324d.f4618t = true;
                        componentCallbacksC0077bwM5324d.f4575C = resourceId != 0 ? resourceId : id;
                        componentCallbacksC0077bwM5324d.f4576D = id;
                        componentCallbacksC0077bwM5324d.f4577E = string;
                        componentCallbacksC0077bwM5324d.f4619u = true;
                        componentCallbacksC0077bwM5324d.f4623y = this.f5491a;
                        C0111cq c0111cq = this.f5491a;
                        componentCallbacksC0077bwM5324d.f4624z = c0111cq.f8789i;
                        componentCallbacksC0077bwM5324d.onInflate(c0111cq.f8789i.f5399c, attributeSet, componentCallbacksC0077bwM5324d.f4605g);
                        jewVarM5319ad = this.f5491a.m5318ac(componentCallbacksC0077bwM5324d);
                        if (C0111cq.m5275S(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Fragment ");
                            sb.append(componentCallbacksC0077bwM5324d);
                            sb.append(" has been inflated via the <fragment> tag: id=0x");
                            sb.append(Integer.toHexString(resourceId));
                        }
                    } else {
                        if (componentCallbacksC0077bwM5324d.f4619u) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        componentCallbacksC0077bwM5324d.f4619u = true;
                        componentCallbacksC0077bwM5324d.f4623y = this.f5491a;
                        C0111cq c0111cq2 = this.f5491a;
                        componentCallbacksC0077bwM5324d.f4624z = c0111cq2.f8789i;
                        componentCallbacksC0077bwM5324d.onInflate(c0111cq2.f8789i.f5399c, attributeSet, componentCallbacksC0077bwM5324d.f4605g);
                        jewVarM5319ad = this.f5491a.m5319ad(componentCallbacksC0077bwM5324d);
                        if (C0111cq.m5275S(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Retained Fragment ");
                            sb2.append(componentCallbacksC0077bwM5324d);
                            sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                            sb2.append(Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i2 = ajr.f565a;
                    componentCallbacksC0077bwM5324d.getClass();
                    ajs ajsVar = new ajs(componentCallbacksC0077bwM5324d, viewGroup);
                    ajr.m842d(ajsVar);
                    ajq ajqVarM840b = ajr.m840b(componentCallbacksC0077bwM5324d);
                    if (ajqVarM840b.f563b.contains(ajp.DETECT_FRAGMENT_TAG_USAGE) && ajr.m843e(ajqVarM840b, componentCallbacksC0077bwM5324d.getClass(), ajsVar.getClass())) {
                        ajr.m841c(ajqVarM840b, ajsVar);
                    }
                    componentCallbacksC0077bwM5324d.f4585M = viewGroup;
                    jewVarM5319ad.m13002e();
                    jewVarM5319ad.m13001d();
                    View view2 = componentCallbacksC0077bwM5324d.f4586N;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (componentCallbacksC0077bwM5324d.f4586N.getTag() == null) {
                        componentCallbacksC0077bwM5324d.f4586N.setTag(string);
                    }
                    componentCallbacksC0077bwM5324d.f4586N.addOnAttachStateChangeListener(new fdi(this, jewVarM5319ad, 1, null));
                    return componentCallbacksC0077bwM5324d.f4586N;
                }
            } catch (ClassNotFoundException e) {
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
