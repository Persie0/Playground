package p000;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends ge3 {

    /* JADX INFO: renamed from: a */
    public final zi3 f58733a;

    /* JADX INFO: renamed from: b */
    public final pj5 f58734b;

    /* JADX INFO: renamed from: c */
    public final ui3 f58735c;

    public r50(zi3 zi3Var, pj5 pj5Var, ui3 ui3Var) {
        this.f58733a = zi3Var;
        this.f58734b = pj5Var;
        this.f58735c = ui3Var;
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: c */
    public final void mo12509c(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
        Object failure;
        abstractComponentCallbacksC0635c.getClass();
        if (((Boolean) this.f58735c.mo0a()).booleanValue()) {
            String canonicalName = abstractComponentCallbacksC0635c.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = abstractComponentCallbacksC0635c.getClass().getSimpleName();
            }
            try {
                failure = abstractComponentCallbacksC0635c.m2110l().getResourceEntryName(abstractComponentCallbacksC0635c.f5678T);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable thM15355a = Result.m15355a(failure);
            if (thM15355a != null) {
                this.f58734b.mo16255a("Failed to get resource entry name: " + thM15355a);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str = (String) failure;
            id3 id3VarM2105g = abstractComponentCallbacksC0635c.m2105g();
            this.f58733a.invoke("[Amplitude] Fragment Viewed", AbstractC3194a.m15365R(new Pair("[Amplitude] Fragment Class", canonicalName), new Pair("[Amplitude] Fragment Identifier", str), new Pair("[Amplitude] Screen Name", id3VarM2105g != null ? l70.m15958u(id3VarM2105g) : null), new Pair("[Amplitude] Fragment Tag", abstractComponentCallbacksC0635c.f5680V)));
        }
    }
}
