package tk;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: tk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C9305i extends AbstractC4949k<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC4949k f48036a;

    public C9305i(AbstractC4949k abstractC4949k) {
        this.f48036a = abstractC4949k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        boolean z10 = jsonReader.f32179e;
        jsonReader.f32179e = true;
        try {
            Object objMo9385a = this.f48036a.mo9385a(jsonReader);
            jsonReader.f32179e = z10;
            return objMo9385a;
        } catch (Throwable th2) {
            jsonReader.f32179e = z10;
            throw th2;
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        boolean z10 = abstractC9310n.f48046e;
        abstractC9310n.f48046e = true;
        try {
            this.f48036a.mo9386f(abstractC9310n, obj);
            abstractC9310n.f48046e = z10;
        } catch (Throwable th2) {
            abstractC9310n.f48046e = z10;
            throw th2;
        }
    }

    public final String toString() {
        return this.f48036a + ".lenient()";
    }
}
