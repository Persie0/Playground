package okhttp3.internal.cache;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13365d2 = {"Ljava/io/IOException;", "it", "Lsl/e;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements InterfaceC2052l<IOException, C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DiskLruCache f43857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f43857b = diskLruCache;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C9072e mo528n(IOException iOException) {
        C5207g.m11111f(iOException, "it");
        byte[] bArr = C9347b.f48082a;
        this.f43857b.f43816H = true;
        return C9072e.f47360a;
    }
}
