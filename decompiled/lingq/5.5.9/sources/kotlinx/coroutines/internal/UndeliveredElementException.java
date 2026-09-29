package kotlinx.coroutines.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Lkotlinx/coroutines/internal/UndeliveredElementException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UndeliveredElementException extends RuntimeException {
    public UndeliveredElementException(String str, Throwable th2) {
        super(str, th2);
    }
}
