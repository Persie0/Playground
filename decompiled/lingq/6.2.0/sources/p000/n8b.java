package p000;

import androidx.work.WorkInfo$State;

/* JADX INFO: loaded from: classes2.dex */
public final class n8b {

    /* JADX INFO: renamed from: a */
    public String f52497a;

    /* JADX INFO: renamed from: b */
    public WorkInfo$State f52498b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8b)) {
            return false;
        }
        n8b n8bVar = (n8b) obj;
        return fa4.m11650l(this.f52497a, n8bVar.f52497a) && this.f52498b == n8bVar.f52498b;
    }

    public final int hashCode() {
        return this.f52498b.hashCode() + (this.f52497a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f52497a + ", state=" + this.f52498b + ')';
    }
}
