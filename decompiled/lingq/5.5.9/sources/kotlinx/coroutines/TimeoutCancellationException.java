package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import no.InterfaceC7875v0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m13365d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC7875v0 f39995a;

    public TimeoutCancellationException(String str, InterfaceC7875v0 interfaceC7875v0) {
        super(str);
        this.f39995a = interfaceC7875v0;
    }
}
