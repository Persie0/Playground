package p253m1;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.internal.instrument.InstrumentData;
import com.google.common.collect.AbstractC3177a0;
import com.google.common.collect.AbstractC3190i;
import dm.C5207g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import p134g8.C5715b;
import p166i1.C6161p;
import p339qe.C8596a;
import p404u2.C9384d;
import p454wa.C9892q;
import ua.C9496e;

/* JADX INFO: renamed from: m1.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7461h implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41294a;

    public /* synthetic */ C7461h(int i10) {
        this.f41294a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f41294a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f38013b).intValue() - ((Number) pair.f38012a).intValue()) - (((Number) pair2.f38013b).intValue() - ((Number) pair2.f38012a).intValue());
            case 1:
                InstrumentData instrumentData = (InstrumentData) obj2;
                C5207g.m11110e(instrumentData, "o2");
                return ((InstrumentData) obj).m6678a(instrumentData);
            case 3:
                AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
                return 0;
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 5;
                return AbstractC3190i.a.m9135f(new C7461h(i10).compare((C9496e.h) Collections.max(list, new C5715b(i10)), (C9496e.h) Collections.max(list2, new C9384d(4)))).mo9130a(list.size(), list2.size()).mo9131b((C9496e.h) Collections.max(list, new C6161p(2)), (C9496e.h) Collections.max(list2, new C5715b(6)), new C9384d(i10)).mo9134e();
            case 5:
                return C9496e.h.m17961g((C9496e.h) obj, (C9496e.h) obj2);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C9892q.a) obj).f50522a - ((C9892q.a) obj2).f50522a;
        }
        Charset charset = C8596a.f46067d;
        String name = ((File) obj).getName();
        int i11 = C8596a.f46068e;
        return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
    }
}
