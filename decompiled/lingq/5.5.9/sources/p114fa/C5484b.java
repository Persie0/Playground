package p114fa;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.C2529c;
import java.io.IOException;
import java.util.List;
import p114fa.InterfaceC5483a;
import p454wa.C9883h;

/* JADX INFO: renamed from: fa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5484b<T extends InterfaceC5483a<T>> implements C2529c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C2529c.a<? extends T> f34068a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f34069b;

    public C5484b(C2529c.a<? extends T> aVar, List<StreamKey> list) {
        this.f34068a = aVar;
        this.f34069b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.C2529c.a
    /* JADX INFO: renamed from: a */
    public final Object mo7296a(Uri uri, C9883h c9883h) throws IOException {
        InterfaceC5483a interfaceC5483a = (InterfaceC5483a) this.f34068a.mo7296a(uri, c9883h);
        List<StreamKey> list = this.f34069b;
        if (list != null) {
            if (!list.isEmpty()) {
                interfaceC5483a = (InterfaceC5483a) interfaceC5483a.mo7321a(list);
            }
        }
        return interfaceC5483a;
    }
}
