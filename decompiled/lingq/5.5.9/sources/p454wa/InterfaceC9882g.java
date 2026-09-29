package p454wa;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wa.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9882g extends InterfaceC9880e {

    /* JADX INFO: renamed from: wa.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC9882g mo14771a();
    }

    void close() throws IOException;

    /* JADX INFO: renamed from: e */
    long mo7273e(C9884i c9884i) throws IOException;

    /* JADX INFO: renamed from: g */
    void mo7274g(InterfaceC9894s interfaceC9894s);

    /* JADX INFO: renamed from: h */
    default Map<String, List<String>> mo7275h() {
        return Collections.emptyMap();
    }

    /* JADX INFO: renamed from: k */
    Uri mo7276k();
}
