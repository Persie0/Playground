package kotlinx.coroutines.flow;

import ae.C0062b;
import kotlin.collections.C6752c;
import kotlin.collections.builders.ListBuilder;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p003a2.C0009a;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
public final class StartedWhileSubscribed implements InterfaceC7140u {

    /* JADX INFO: renamed from: a */
    public final long f40257a;

    /* JADX INFO: renamed from: b */
    public final long f40258b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public StartedWhileSubscribed(long j10, long j11) {
        this.f40257a = j10;
        this.f40258b = j11;
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 < 0 ? false : z10) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7140u
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<SharingCommand> mo14363a(InterfaceC7142w<Integer> interfaceC7142w) {
        return C0062b.m273H0(new C7129j(new StartedWhileSubscribed$command$2(null), C0062b.m399t2(interfaceC7142w, new StartedWhileSubscribed$command$1(this, null))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f40257a == startedWhileSubscribed.f40257a && this.f40258b == startedWhileSubscribed.f40258b) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.f40258b) + (Long.hashCode(this.f40257a) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j10 = this.f40257a;
        if (j10 > 0) {
            listBuilder.add("stopTimeout=" + j10 + "ms");
        }
        long j11 = this.f40258b;
        if (j11 < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j11 + "ms");
        }
        C9000b.m17239e(listBuilder);
        return C0009a.m22j(new StringBuilder("SharingStarted.WhileSubscribed("), C6752c.m13430X(listBuilder, null, null, null, null, 63), ')');
    }
}
