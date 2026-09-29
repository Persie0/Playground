package hm;

import dm.C5207g;
import java.util.Random;

/* JADX INFO: renamed from: hm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6080b extends AbstractC6079a {

    /* JADX INFO: renamed from: c */
    public final a f35816c = new a();

    /* JADX INFO: renamed from: hm.b$a */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // hm.AbstractC6079a
    /* JADX INFO: renamed from: e */
    public final Random mo12512e() {
        Random random = this.f35816c.get();
        C5207g.m11110e(random, "implStorage.get()");
        return random;
    }
}
