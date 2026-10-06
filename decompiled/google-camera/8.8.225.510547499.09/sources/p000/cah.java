package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cah implements cal {

    /* JADX INFO: renamed from: a */
    private bzw f4915a;

    public cah() {
        if (!cbi.m3393n(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: c */
    public final bzw mo3337c() {
        return this.f4915a;
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: d */
    public final void mo3338d(cak cakVar) {
        cakVar.mo3358g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: e */
    public final void mo3339e(Drawable drawable) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: f */
    public final void mo3340f(Drawable drawable) {
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: g */
    public final void mo2867g() {
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: h */
    public final void mo2868h() {
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: i */
    public final void mo2869i() {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: j */
    public final void mo3341j(cak cakVar) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: k */
    public final void mo3342k(bzw bzwVar) {
        this.f4915a = bzwVar;
    }
}
