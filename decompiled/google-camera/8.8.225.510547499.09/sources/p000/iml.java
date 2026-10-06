package p000;

import android.util.Log;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iml implements jpk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31529a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31530b;

    public /* synthetic */ iml(imn imnVar, int i) {
        this.f31530b = i;
        this.f31529a = imnVar;
    }

    public /* synthetic */ iml(irg irgVar, int i) {
        this.f31530b = i;
        this.f31529a = irgVar;
    }

    public /* synthetic */ iml(String str, int i) {
        this.f31530b = i;
        this.f31529a = str;
    }

    @Override // p000.jpk
    /* JADX INFO: renamed from: c */
    public final void mo11475c(Exception exc) {
        int i = this.f31530b;
        String str = TVkaNXnfP.hkqBMDt;
        switch (i) {
            case 0:
                Object obj = this.f31529a;
                ((nbe) ((nbe) ((nbe) imn.f31531a.m17252c()).mo17283h(exc)).mo17276G((char) 4322)).mo17290o("Failed to get app update info");
                ((imn) obj).f31533c.mo11463h();
                break;
            case 1:
                ((nbe) ((nbe) ((nbe) con.f8470a.m17251b()).mo17283h(exc)).mo17276G(363)).mo17293r("Scheduling training failed for population: %s", this.f31529a);
                break;
            case 2:
                Object obj2 = this.f31529a;
                ((nbe) ((nbe) irg.f31862a.m17252c()).mo17276G((char) 4382)).mo17290o("Wearable api is not available");
                irg irgVar = (irg) obj2;
                irgVar.f31896t = false;
                irgVar.f31898v = false;
                break;
            case 3:
                Object obj3 = this.f31529a;
                boolean z = ktp.f37178a;
                Log.w(str, String.format(rmwTRjObXLGH.okgiE, obj3, exc));
                break;
            default:
                Object obj4 = this.f31529a;
                boolean z2 = ktp.f37178a;
                Log.w(str, String.format("Fail to register phenotypeflags for %s. %s", obj4, exc));
                break;
        }
    }
}
