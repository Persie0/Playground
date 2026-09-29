package androidx.datastore.preferences.core;

import androidx.datastore.core.SingleProcessDataStore;
import cm.InterfaceC2056p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p129g3.InterfaceC5687d;
import p212k3.AbstractC6579a;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStore implements InterfaceC5687d<AbstractC6579a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5687d<AbstractC6579a> f5785a;

    public PreferenceDataStore(SingleProcessDataStore singleProcessDataStore) {
        this.f5785a = singleProcessDataStore;
    }

    @Override // p129g3.InterfaceC5687d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<AbstractC6579a> mo3005a() {
        return this.f5785a.mo3005a();
    }

    @Override // p129g3.InterfaceC5687d
    /* JADX INFO: renamed from: b */
    public final Object mo3006b(InterfaceC2056p<? super AbstractC6579a, ? super InterfaceC9968c<? super AbstractC6579a>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super AbstractC6579a> interfaceC9968c) {
        return this.f5785a.mo3006b(new PreferenceDataStore$updateData$2(interfaceC2056p, null), interfaceC9968c);
    }
}
