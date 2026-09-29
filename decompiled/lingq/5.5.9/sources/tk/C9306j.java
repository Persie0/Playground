package tk;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: tk.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C9306j extends AbstractC4949k<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC4949k f48037a;

    public C9306j(AbstractC4949k abstractC4949k) {
        this.f48037a = abstractC4949k;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        boolean z10 = jsonReader.f32180f;
        jsonReader.f32180f = true;
        try {
            Object objMo9385a = this.f48037a.mo9385a(jsonReader);
            jsonReader.f32180f = z10;
            return objMo9385a;
        } catch (Throwable th2) {
            jsonReader.f32180f = z10;
            throw th2;
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: c */
    public final boolean mo10533c() {
        return this.f48037a.mo10533c();
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        this.f48037a.mo9386f(abstractC9310n, obj);
    }

    public final String toString() {
        return this.f48037a + ".failOnUnknown()";
    }
}
