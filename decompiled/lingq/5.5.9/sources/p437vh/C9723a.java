package p437vh;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4951m;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: vh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9723a extends AbstractC4949k<Pair<? extends Object, ? extends Object>> {

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<Object> f49740a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Object> f49741b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<String>> f49742c;

    public C9723a(AbstractC4949k<Object> abstractC4949k, AbstractC4949k<Object> abstractC4949k2, AbstractC4949k<List<String>> abstractC4949k3) {
        this.f49740a = abstractC4949k;
        this.f49741b = abstractC4949k2;
        this.f49742c = abstractC4949k3;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Pair<? extends Object, ? extends Object> mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        List<String> listMo9385a = this.f49742c.mo9385a(jsonReader);
        if (listMo9385a == null) {
            return null;
        }
        if (!(listMo9385a.size() == 2)) {
            throw new IllegalArgumentException(("Pair with more or less than two elements: " + listMo9385a).toString());
        }
        String str = listMo9385a.get(0);
        AbstractC4949k<Object> abstractC4949k = this.f49740a;
        abstractC4949k.getClass();
        try {
            Object objMo9385a = abstractC4949k.mo9385a(new C4951m(str));
            String str2 = listMo9385a.get(1);
            AbstractC4949k<Object> abstractC4949k2 = this.f49741b;
            abstractC4949k2.getClass();
            try {
                return new Pair<>(objMo9385a, abstractC4949k2.mo9385a(new C4951m(str2)));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Pair<? extends Object, ? extends Object> pair) throws IOException {
        Pair<? extends Object, ? extends Object> pair2 = pair;
        C5207g.m11111f(abstractC9310n, "writer");
        if (pair2 == null) {
            throw new NullPointerException("value == null");
        }
        abstractC9310n.mo10555a();
        this.f49740a.mo9386f(abstractC9310n, pair2.f38012a);
        this.f49741b.mo9386f(abstractC9310n, pair2.f38013b);
        abstractC9310n.mo10559q();
    }
}
