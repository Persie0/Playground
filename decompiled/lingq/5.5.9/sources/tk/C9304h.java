package tk;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: tk.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9304h extends AbstractC4949k<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC4949k f48035a;

    public C9304h(AbstractC4949k abstractC4949k) {
        this.f48035a = abstractC4949k;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        return this.f48035a.mo9385a(jsonReader);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: c */
    public final boolean mo10533c() {
        return this.f48035a.mo10533c();
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        boolean z10 = abstractC9310n.f48047f;
        abstractC9310n.f48047f = true;
        try {
            this.f48035a.mo9386f(abstractC9310n, obj);
            abstractC9310n.f48047f = z10;
        } catch (Throwable th2) {
            abstractC9310n.f48047f = z10;
            throw th2;
        }
    }

    public final String toString() {
        return this.f48035a + ".serializeNulls()";
    }
}
