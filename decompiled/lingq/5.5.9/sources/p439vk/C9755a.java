package p439vk;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: vk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9755a<T> extends AbstractC4949k<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<T> f49810a;

    public C9755a(AbstractC4949k<T> abstractC4949k) {
        this.f49810a = abstractC4949k;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final T mo9385a(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo10505d0() != JsonReader.Token.NULL) {
            return this.f49810a.mo9385a(jsonReader);
        }
        jsonReader.mo10501Q();
        return null;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, T t10) throws IOException {
        if (t10 == null) {
            abstractC9310n.mo10552E();
        } else {
            this.f49810a.mo9386f(abstractC9310n, t10);
        }
    }

    public final String toString() {
        return this.f49810a + ".nullSafe()";
    }
}
