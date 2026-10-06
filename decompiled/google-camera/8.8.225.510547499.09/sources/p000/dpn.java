package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dpn extends dpk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dpo f12217a;

    public dpn(dpo dpoVar) {
        this.f12217a = dpoVar;
    }

    @Override // p000.dpk
    /* JADX INFO: renamed from: b */
    public void mo6548b(dow dowVar) {
        String string;
        EvCompView evCompView = this.f12217a.f12218a;
        if (((dot) ((jwf) evCompView.f6643b).f34942d).equals(dot.SINGLE)) {
            string = evCompView.getContext().getResources().getString(C0100R.string.ev_announcement, EvCompView.m4100d(evCompView.f6652k));
        } else if (dowVar.equals(dow.BRIGHTNESS)) {
            string = evCompView.getContext().getResources().getString(C0100R.string.brightness_ev_announcement, EvCompView.m4100d(evCompView.f6652k));
        } else {
            if (!dowVar.equals(dow.SHADOW)) {
                return;
            }
            string = evCompView.getContext().getResources().getString(C0100R.string.shadow_ev_announcement, EvCompView.m4100d(evCompView.f6653l));
        }
        evCompView.announceForAccessibility(string);
    }

    @Override // p000.dpk
    /* JADX INFO: renamed from: d */
    public final void mo6550d(float f, dow dowVar) {
        this.f12217a.f12227j.mo3415bf(false);
        this.f12217a.m6555m(f, dowVar);
    }

    @Override // p000.dpk, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f12217a.f12221d.mo3415bf(true);
        this.f12217a.f12220c.mo3415bf(true);
    }

    @Override // p000.dpk, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f12217a.f12220c.mo3415bf(false);
    }
}
