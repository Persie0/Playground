package p064d5;

import p026b5.AbstractC1314g;
import p214k5.C6617s;

/* JADX INFO: renamed from: d5.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5044a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6617s f32879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5045b f32880b;

    public RunnableC5044a(C5045b c5045b, C6617s c6617s) {
        this.f32880b = c5045b;
        this.f32879a = c6617s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        String str = C5045b.f32881d;
        StringBuilder sb2 = new StringBuilder("Scheduling work ");
        C6617s c6617s = this.f32879a;
        sb2.append(c6617s.f37524a);
        abstractC1314gM4867d.mo4869a(str, sb2.toString());
        this.f32880b.f32882a.mo5460a(c6617s);
    }
}
