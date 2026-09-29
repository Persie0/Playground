package androidx.activity.result;

import java.util.HashMap;
import p035c.AbstractC1641a;

/* JADX INFO: renamed from: androidx.activity.result.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0206e extends AbstractC0203b<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1641a f519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0207f f520c;

    public C0206e(AbstractC0207f abstractC0207f, String str, AbstractC1641a abstractC1641a) {
        this.f520c = abstractC0207f;
        this.f518a = str;
        this.f519b = abstractC1641a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.activity.result.AbstractC0203b
    /* JADX INFO: renamed from: a */
    public final void mo844a(Object obj) throws Exception {
        AbstractC0207f abstractC0207f = this.f520c;
        HashMap map = abstractC0207f.f523c;
        String str = this.f518a;
        Integer num = (Integer) map.get(str);
        AbstractC1641a abstractC1641a = this.f519b;
        if (num != null) {
            abstractC0207f.f525e.add(str);
            try {
                abstractC0207f.mo801b(num.intValue(), abstractC1641a, obj);
                return;
            } catch (Exception e10) {
                abstractC0207f.f525e.remove(str);
                throw e10;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1641a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    /* JADX INFO: renamed from: b */
    public final void m865b() {
        this.f520c.m870f(this.f518a);
    }
}
