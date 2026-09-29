package p000;

import com.amplitude.core.platform.WriteQueueMessageType;

/* JADX INFO: loaded from: classes.dex */
public final class o9b {

    /* JADX INFO: renamed from: a */
    public final WriteQueueMessageType f54090a;

    /* JADX INFO: renamed from: b */
    public final b90 f54091b;

    public o9b(WriteQueueMessageType writeQueueMessageType, b90 b90Var) {
        writeQueueMessageType.getClass();
        this.f54090a = writeQueueMessageType;
        this.f54091b = b90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9b)) {
            return false;
        }
        o9b o9bVar = (o9b) obj;
        return this.f54090a == o9bVar.f54090a && fa4.m11650l(this.f54091b, o9bVar.f54091b);
    }

    public final int hashCode() {
        int iHashCode = this.f54090a.hashCode() * 31;
        b90 b90Var = this.f54091b;
        return iHashCode + (b90Var == null ? 0 : b90Var.hashCode());
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + this.f54090a + ", event=" + this.f54091b + ')';
    }
}
