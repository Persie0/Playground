package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: by */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0079by extends C0086ce implements aca, acb, InterfaceC0130di, InterfaceC0131dj, alw, InterfaceC0914ps, InterfaceC0924qb, aqn, InterfaceC0114ct, aep {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ActivityC0080bz f4732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079by(ActivityC0080bz activityC0080bz) {
        super(activityC0080bz, activityC0080bz, new Handler());
        this.f4732a = activityC0080bz;
    }

    @Override // p000.C0086ce, p000.AbstractC0083cb
    /* JADX INFO: renamed from: a */
    public final View mo2638a(int i) {
        return this.f4732a.findViewById(i);
    }

    @Override // p000.C0086ce, p000.AbstractC0083cb
    /* JADX INFO: renamed from: b */
    public final boolean mo2639b() {
        Window window = this.f4732a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.InterfaceC0924qb
    /* JADX INFO: renamed from: c */
    public final C0923qa mo3177c() {
        return this.f4732a.f47427h;
    }

    @Override // p000.aca
    /* JADX INFO: renamed from: d */
    public final void mo176d(aea aeaVar) {
        this.f4732a.mo176d(aeaVar);
    }

    @Override // p000.C0086ce
    /* JADX INFO: renamed from: e */
    public final void mo3178e() {
        this.f4732a.invalidateOptionsMenu();
    }

    @Override // p000.aca
    /* JADX INFO: renamed from: f */
    public final void mo177f(aea aeaVar) {
        this.f4732a.mo177f(aeaVar);
    }

    @Override // p000.InterfaceC0114ct
    /* JADX INFO: renamed from: g */
    public final void mo3179g() {
    }

    @Override // p000.akv
    public final aks getLifecycle() {
        return this.f4732a.f4795d;
    }

    @Override // p000.aqn
    public final aqm getSavedStateRegistry() {
        return this.f4732a.getSavedStateRegistry();
    }

    @Override // p000.alw
    public final bkn getViewModelStore$ar$class_merging$ar$class_merging() {
        return this.f4732a.getViewModelStore$ar$class_merging$ar$class_merging();
    }
}
