package p338qd;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: qd.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8522a0 extends AbstractC8524b {

    /* JADX INFO: renamed from: a */
    public final long f45787a;

    /* JADX INFO: renamed from: b */
    public final Map f45788b;

    public C8522a0(long j10, HashMap map) {
        this.f45787a = j10;
        this.f45788b = map;
    }

    @Override // p338qd.AbstractC8524b
    /* JADX INFO: renamed from: a */
    public final Map<String, AssetPackState> mo16629a() {
        return this.f45788b;
    }

    @Override // p338qd.AbstractC8524b
    /* JADX INFO: renamed from: b */
    public final long mo16630b() {
        return this.f45787a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8524b) {
            AbstractC8524b abstractC8524b = (AbstractC8524b) obj;
            if (this.f45787a == abstractC8524b.mo16630b() && this.f45788b.equals(abstractC8524b.mo16629a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45787a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f45788b.hashCode();
    }

    public final String toString() {
        String string = this.f45788b.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(this.f45787a);
        sb2.append(", packStates=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
