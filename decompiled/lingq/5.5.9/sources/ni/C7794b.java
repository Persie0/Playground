package ni;

import android.os.Parcelable;
import com.lingq.shared.util.GoalMetType;
import dm.C5207g;

/* JADX INFO: renamed from: ni.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7794b {

    /* JADX INFO: renamed from: a */
    public final GoalMetType f42866a;

    /* JADX INFO: renamed from: b */
    public final Object f42867b;

    public C7794b(GoalMetType goalMetType, Parcelable parcelable) {
        C5207g.m11111f(goalMetType, "goalMetType");
        C5207g.m11111f(parcelable, "data");
        this.f42866a = goalMetType;
        this.f42867b = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7794b)) {
            return false;
        }
        C7794b c7794b = (C7794b) obj;
        return this.f42866a == c7794b.f42866a && C5207g.m11106a(this.f42867b, c7794b.f42867b);
    }

    public final int hashCode() {
        return this.f42867b.hashCode() + (this.f42866a.hashCode() * 31);
    }

    public final String toString() {
        return "GoalMet(goalMetType=" + this.f42866a + ", data=" + this.f42867b + ")";
    }
}
