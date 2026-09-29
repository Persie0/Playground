package p134g8;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.p051ui.C2516c;
import dm.C5207g;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ne.AbstractC7743b0;
import p173i8.C6205a;
import p194j8.C6423a;
import ua.C9496e;

/* JADX INFO: renamed from: g8.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5715b implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34731a;

    public /* synthetic */ C5715b(int i10) {
        this.f34731a = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        switch (this.f34731a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InstrumentData instrumentData = (InstrumentData) obj;
                InstrumentData instrumentData2 = (InstrumentData) obj2;
                if (C6205a.m12742b(C5716c.class)) {
                    return i10;
                }
                try {
                    C5207g.m11110e(instrumentData2, "o2");
                    return instrumentData.m6678a(instrumentData2);
                } catch (Throwable th2) {
                    C6205a.m12741a(C5716c.class, th2);
                    return i10;
                }
            case 1:
                C6423a c6423a = (C6423a) obj;
                C6423a c6423a2 = (C6423a) obj2;
                C5207g.m11110e(c6423a2, "o2");
                c6423a.getClass();
                Long l10 = c6423a.f36900c;
                if (l10 == null) {
                    return -1;
                }
                long jLongValue = l10.longValue();
                Long l11 = c6423a2.f36900c;
                if (l11 == null) {
                    return 1;
                }
                long jLongValue2 = l11.longValue();
                if (jLongValue2 < jLongValue) {
                    i10 = -1;
                } else if (jLongValue2 != jLongValue) {
                    i10 = 1;
                }
                return i10;
            case 2:
                return ((C2416m) obj2).f12480h - ((C2416m) obj).f12480h;
            case 3:
                return ((C9496e.f) ((List) obj).get(i10)).compareTo((C9496e.f) ((List) obj2).get(i10));
            case 4:
                return ((C9496e.a) Collections.max((List) obj)).compareTo((C9496e.a) Collections.max((List) obj2));
            case 5:
                return C9496e.h.m17961g((C9496e.h) obj, (C9496e.h) obj2);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C9496e.h.m17962i((C9496e.h) obj, (C9496e.h) obj2);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C2516c.b bVar = (C2516c.b) obj;
                C2516c.b bVar2 = (C2516c.b) obj2;
                int iCompare = Integer.compare(bVar2.f13564a, bVar.f13564a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = bVar2.f13566c.compareTo(bVar.f13566c);
                return iCompareTo != 0 ? iCompareTo : bVar2.f13567d.compareTo(bVar.f13567d);
            default:
                return ((AbstractC7743b0.c) obj).mo15362a().compareTo(((AbstractC7743b0.c) obj2).mo15362a());
        }
    }
}
