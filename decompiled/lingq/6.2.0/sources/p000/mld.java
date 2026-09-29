package p000;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class mld {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f51503a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f51504b;

    /* JADX INFO: renamed from: c */
    public final UUID f51505c;

    public mld(ImmutableList immutableList, ImmutableList immutableList2, UUID uuid) {
        this.f51503a = immutableList;
        this.f51504b = immutableList2;
        this.f51505c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mld)) {
            return false;
        }
        mld mldVar = (mld) obj;
        return this.f51503a.equals(mldVar.f51503a) && this.f51504b.equals(mldVar.f51504b) && this.f51505c.equals(mldVar.f51505c);
    }

    public final int hashCode() {
        return (this.f51505c.hashCode() ^ ((((this.f51503a.hashCode() ^ 1000003) * 1000003) ^ this.f51504b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f51503a);
    }
}
