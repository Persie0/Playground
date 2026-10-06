package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class can extends caf {

    /* JADX INFO: renamed from: a */
    protected final View f4918a;

    /* JADX INFO: renamed from: b */
    public final AmbientDelegate f4919b;

    public can(View view) {
        bzq.m3278r(view);
        this.f4918a = view;
        this.f4919b = new AmbientDelegate(view);
    }

    @Override // p000.caf, p000.cal
    /* JADX INFO: renamed from: c */
    public final bzw mo3337c() {
        Object tag = this.f4918a.getTag(C0100R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof bzw) {
            return (bzw) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // p000.cal
    /* JADX INFO: renamed from: d */
    public final void mo3338d(cak cakVar) {
        AmbientDelegate ambientDelegate = this.f4919b;
        int iM1589T = ambientDelegate.m1589T();
        int iM1588S = ambientDelegate.m1588S();
        if (AmbientDelegate.m1571V(iM1589T, iM1588S)) {
            cakVar.mo3358g(iM1589T, iM1588S);
            return;
        }
        if (!ambientDelegate.f1686b.contains(cakVar)) {
            ambientDelegate.f1686b.add(cakVar);
        }
        if (ambientDelegate.f1685a == null) {
            ViewTreeObserver viewTreeObserver = ((View) ambientDelegate.f1687c).getViewTreeObserver();
            ambientDelegate.f1685a = new cam(ambientDelegate, null, null, null, null);
            viewTreeObserver.addOnPreDrawListener(ambientDelegate.f1685a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // p000.cal
    /* JADX INFO: renamed from: j */
    public final void mo3341j(cak cakVar) {
        this.f4919b.f1686b.remove(cakVar);
    }

    @Override // p000.caf, p000.cal
    /* JADX INFO: renamed from: k */
    public final void mo3342k(bzw bzwVar) {
        this.f4918a.setTag(C0100R.id.glide_custom_view_target_tag, bzwVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.f4918a.toString());
    }
}
