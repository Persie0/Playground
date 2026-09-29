package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p124fp.C5608e;
import p439vk.C9755a;
import tk.AbstractC9310n;
import tk.C9305i;
import tk.C9309m;

/* JADX INFO: renamed from: com.squareup.moshi.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4949k<T> {

    /* JADX INFO: renamed from: com.squareup.moshi.k$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo9385a(JsonReader jsonReader) throws IOException;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final T m10532b(String str) throws IOException {
        C5608e c5608e = new C5608e();
        c5608e.m11969t1(str);
        C4950l c4950l = new C4950l(c5608e);
        T tMo9385a = mo9385a(c4950l);
        if (!mo10533c() && c4950l.mo10505d0() != JsonReader.Token.END_DOCUMENT) {
            throw new JsonDataException("JSON document was not fully consumed.");
        }
        return tMo9385a;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo10533c() {
        return this instanceof C9305i;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<T> m10534d() {
        return this instanceof C9755a ? this : new C9755a(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final String m10535e(T t10) {
        C5608e c5608e = new C5608e();
        try {
            mo9386f(new C9309m(c5608e), t10);
            return c5608e.m11934I0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo9386f(AbstractC9310n abstractC9310n, T t10) throws IOException;
}
