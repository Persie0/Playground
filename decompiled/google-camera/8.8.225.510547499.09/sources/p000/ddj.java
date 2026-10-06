package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ddj {

    /* JADX INFO: renamed from: a */
    public final ddp f10562a;

    /* JADX INFO: renamed from: b */
    public int f10563b;

    /* JADX INFO: renamed from: c */
    public int f10564c;

    /* JADX INFO: renamed from: d */
    public int f10565d;

    public ddj(ddp ddpVar) {
        this.f10562a = ddpVar;
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("Reason", this.f10562a);
        mrlVarM16765d.m16826e("Impressions before reboot", this.f10563b);
        mrlVarM16765d.m16826e(VzWFSVj.lASK, this.f10564c);
        mrlVarM16765d.m16826e("Reboot count", this.f10565d);
        return mrlVarM16765d.toString();
    }
}
