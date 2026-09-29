package uk;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.Date;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: uk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9553b extends AbstractC4949k<Date> {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Date mo9385a(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.mo10505d0() == JsonReader.Token.NULL) {
                jsonReader.mo10501Q();
                return null;
            }
            return C9552a.m17998d(jsonReader.mo10502U());
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            try {
                if (date2 == null) {
                    abstractC9310n.mo10552E();
                } else {
                    abstractC9310n.mo10558m0(C9552a.m17996b(date2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
