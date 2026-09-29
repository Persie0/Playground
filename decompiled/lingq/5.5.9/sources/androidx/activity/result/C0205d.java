package androidx.activity.result;

import java.util.HashMap;
import p035c.AbstractC1641a;

/* JADX INFO: renamed from: androidx.activity.result.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0205d extends AbstractC0203b<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1641a f516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0207f f517c;

    public C0205d(AbstractC0207f abstractC0207f, String str, AbstractC1641a abstractC1641a) {
        this.f517c = abstractC0207f;
        this.f515a = str;
        this.f516b = abstractC1641a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.activity.result.AbstractC0203b
    /* JADX INFO: renamed from: a */
    public final void mo844a(Object obj) throws Exception {
        AbstractC0207f abstractC0207f = this.f517c;
        HashMap map = abstractC0207f.f523c;
        String str = this.f515a;
        Integer num = (Integer) map.get(str);
        AbstractC1641a abstractC1641a = this.f516b;
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
}
