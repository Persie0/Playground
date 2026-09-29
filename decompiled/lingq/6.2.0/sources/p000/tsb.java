package p000;

import com.google.android.gms.internal.clearcut.AbstractC0949b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tsb implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0949b f62832a;

    /* JADX INFO: renamed from: b */
    public AbstractC0949b f62833b;

    /* JADX INFO: renamed from: c */
    public boolean f62834c = false;

    public tsb(AbstractC0949b abstractC0949b) {
        this.f62832a = abstractC0949b;
        this.f62833b = (AbstractC0949b) abstractC0949b.mo5293a(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m22294a(AbstractC0949b abstractC0949b) {
        m22295b();
        AbstractC0949b abstractC0949b2 = this.f62833b;
        r0c r0cVar = r0c.f58470c;
        r0cVar.getClass();
        r0cVar.m20230a(abstractC0949b2.getClass()).mo5307b(abstractC0949b2, abstractC0949b);
    }

    /* JADX INFO: renamed from: b */
    public final void m22295b() {
        if (this.f62834c) {
            AbstractC0949b abstractC0949b = (AbstractC0949b) this.f62833b.mo5293a(4);
            AbstractC0949b abstractC0949b2 = this.f62833b;
            r0c r0cVar = r0c.f58470c;
            r0cVar.getClass();
            r0cVar.m20230a(abstractC0949b.getClass()).mo5307b(abstractC0949b, abstractC0949b2);
            this.f62833b = abstractC0949b;
            this.f62834c = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0949b m22296c() {
        boolean z = this.f62834c;
        AbstractC0949b abstractC0949b = this.f62833b;
        if (z) {
            return abstractC0949b;
        }
        r0c r0cVar = r0c.f58470c;
        r0cVar.getClass();
        r0cVar.m20230a(abstractC0949b.getClass()).mo5306a(abstractC0949b);
        this.f62834c = true;
        return this.f62833b;
    }

    public final /* synthetic */ Object clone() {
        tsb tsbVar = (tsb) this.f62832a.mo5293a(5);
        tsbVar.m22294a(m22296c());
        return tsbVar;
    }
}
