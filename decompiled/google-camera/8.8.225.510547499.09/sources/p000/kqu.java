package p000;

import android.content.Context;
import java.text.DateFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqu {

    /* JADX INFO: renamed from: a */
    public String f36936a;

    /* JADX INFO: renamed from: b */
    public String f36937b;

    /* JADX INFO: renamed from: c */
    public String f36938c;

    /* JADX INFO: renamed from: d */
    public String f36939d;

    /* JADX INFO: renamed from: e */
    public String f36940e;

    /* JADX INFO: renamed from: f */
    public String f36941f;

    /* JADX INFO: renamed from: g */
    public int f36942g;

    /* JADX INFO: renamed from: h */
    public boolean f36943h;

    /* JADX INFO: renamed from: i */
    public boolean f36944i;

    /* JADX INFO: renamed from: j */
    public mxk f36945j;

    /* JADX INFO: renamed from: k */
    public DateFormat f36946k;

    /* JADX INFO: renamed from: l */
    public mwx f36947l;

    /* JADX INFO: renamed from: m */
    public Context f36948m;

    /* JADX INFO: renamed from: n */
    public String f36949n;

    /* JADX INFO: renamed from: o */
    public String f36950o;

    /* JADX INFO: renamed from: p */
    public String f36951p;

    /* JADX INFO: renamed from: q */
    public krj f36952q;

    /* JADX INFO: renamed from: r */
    public boolean f36953r;

    /* JADX INFO: renamed from: s */
    public long f36954s;

    /* JADX INFO: renamed from: t */
    public byte f36955t;

    /* JADX INFO: renamed from: a */
    public final void m14724a(int i) {
        this.f36942g = i;
        this.f36955t = (byte) (this.f36955t | 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m14725b() {
        this.f36941f = "COVER";
    }

    /* JADX INFO: renamed from: c */
    public final void m14726c(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException("Null filenameBurstSequenceExtensionsSortedLast");
        }
        this.f36945j = mxkVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m14727d() {
        this.f36940e = "BURST-";
    }

    /* JADX INFO: renamed from: e */
    public final void m14728e(boolean z) {
        this.f36943h = z;
        this.f36955t = (byte) (this.f36955t | 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m14729f(boolean z) {
        this.f36944i = z;
        this.f36955t = (byte) (this.f36955t | 4);
    }

    /* JADX INFO: renamed from: g */
    public final void m14730g() {
        this.f36954s = 20000L;
        this.f36955t = (byte) (this.f36955t | 32);
    }

    /* JADX INFO: renamed from: h */
    public final void m14731h() {
        this.f36949n = "";
    }

    /* JADX INFO: renamed from: i */
    public final void m14732i() {
        this.f36951p = "Camera";
    }
}
