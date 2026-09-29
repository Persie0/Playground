package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Map;
import kotlin.C6740a;
import kotlin.collections.C6753d;
import kotlin.collections.builders.ListBuilder;
import mn.C7646c;
import p385sf.C9000b;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6842c {

    /* JADX INFO: renamed from: a */
    public final ReportLevel f38632a;

    /* JADX INFO: renamed from: b */
    public final ReportLevel f38633b;

    /* JADX INFO: renamed from: c */
    public final Map<C7646c, ReportLevel> f38634c;

    /* JADX INFO: renamed from: d */
    public final boolean f38635d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6842c() {
        throw null;
    }

    public C6842c(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map<C7646c, ReportLevel> mapM13459L0 = C6753d.m13459L0();
        this.f38632a = reportLevel;
        this.f38633b = reportLevel2;
        this.f38634c = mapM13459L0;
        C6740a.m13372a(new InterfaceC2041a<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$description$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final String[] mo807E() {
                ListBuilder listBuilder = new ListBuilder();
                C6842c c6842c = this.f38608b;
                listBuilder.add(c6842c.f38632a.getDescription());
                ReportLevel reportLevel3 = c6842c.f38633b;
                if (reportLevel3 != null) {
                    listBuilder.add("under-migration:" + reportLevel3.getDescription());
                }
                for (Map.Entry<C7646c, ReportLevel> entry : c6842c.f38634c.entrySet()) {
                    listBuilder.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
                }
                C9000b.m17239e(listBuilder);
                return (String[]) listBuilder.toArray(new String[0]);
            }
        });
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f38635d = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6842c)) {
            return false;
        }
        C6842c c6842c = (C6842c) obj;
        return this.f38632a == c6842c.f38632a && this.f38633b == c6842c.f38633b && C5207g.m11106a(this.f38634c, c6842c.f38634c);
    }

    public final int hashCode() {
        int iHashCode = this.f38632a.hashCode() * 31;
        ReportLevel reportLevel = this.f38633b;
        return this.f38634c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f38632a + ", migrationLevel=" + this.f38633b + ", userDefinedLevelForSpecificAnnotation=" + this.f38634c + ')';
    }
}
