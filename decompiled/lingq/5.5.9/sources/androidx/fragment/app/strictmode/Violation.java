package androidx.fragment.app.strictmode;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Fragment f6405a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        C5207g.m11111f(fragment, "fragment");
        this.f6405a = fragment;
    }
}
