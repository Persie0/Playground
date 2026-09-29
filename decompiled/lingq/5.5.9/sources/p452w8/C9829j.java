package p452w8;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: renamed from: w8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9829j extends AbstractC9838s {

    /* JADX INFO: renamed from: a */
    public final String f50025a;

    /* JADX INFO: renamed from: b */
    public final byte[] f50026b;

    /* JADX INFO: renamed from: c */
    public final Priority f50027c;

    /* JADX INFO: renamed from: w8.j$a */
    public static final class a extends AbstractC9838s.a {

        /* JADX INFO: renamed from: a */
        public String f50028a;

        /* JADX INFO: renamed from: b */
        public byte[] f50029b;

        /* JADX INFO: renamed from: c */
        public Priority f50030c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C9829j m18322a() {
            String strConcat = this.f50028a == null ? " backendName" : "";
            if (this.f50030c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new C9829j(this.f50028a, this.f50029b, this.f50030c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        /* JADX INFO: renamed from: b */
        public final a m18323b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f50028a = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m18324c(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f50030c = priority;
            return this;
        }
    }

    public C9829j(String str, byte[] bArr, Priority priority) {
        this.f50025a = str;
        this.f50026b = bArr;
        this.f50027c = priority;
    }

    @Override // p452w8.AbstractC9838s
    /* JADX INFO: renamed from: b */
    public final String mo18319b() {
        return this.f50025a;
    }

    @Override // p452w8.AbstractC9838s
    /* JADX INFO: renamed from: c */
    public final byte[] mo18320c() {
        return this.f50026b;
    }

    @Override // p452w8.AbstractC9838s
    /* JADX INFO: renamed from: d */
    public final Priority mo18321d() {
        return this.f50027c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9838s)) {
            return false;
        }
        AbstractC9838s abstractC9838s = (AbstractC9838s) obj;
        if (this.f50025a.equals(abstractC9838s.mo18319b())) {
            if (Arrays.equals(this.f50026b, abstractC9838s instanceof C9829j ? ((C9829j) abstractC9838s).f50026b : abstractC9838s.mo18320c()) && this.f50027c.equals(abstractC9838s.mo18321d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50025a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50026b)) * 1000003) ^ this.f50027c.hashCode();
    }
}
