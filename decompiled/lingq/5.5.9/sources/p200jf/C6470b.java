package p200jf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: jf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6470b implements InterfaceC6475g {

    /* JADX INFO: renamed from: a */
    public final String f37043a;

    /* JADX INFO: renamed from: b */
    public final C6471c f37044b;

    public C6470b(Set<AbstractC6472d> set, C6471c c6471c) {
        this.f37043a = m13079b(set);
        this.f37044b = c6471c;
    }

    /* JADX INFO: renamed from: b */
    public static String m13079b(Set<AbstractC6472d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC6472d> it = set.iterator();
        while (it.hasNext()) {
            AbstractC6472d next = it.next();
            sb2.append(next.mo13077a());
            sb2.append('/');
            sb2.append(next.mo13078b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p200jf.InterfaceC6475g
    /* JADX INFO: renamed from: a */
    public final String mo13080a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        C6471c c6471c = this.f37044b;
        synchronized (c6471c.f37046a) {
            try {
                setUnmodifiableSet = Collections.unmodifiableSet(c6471c.f37046a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f37043a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (c6471c.f37046a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(c6471c.f37046a);
        }
        sb2.append(m13079b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
