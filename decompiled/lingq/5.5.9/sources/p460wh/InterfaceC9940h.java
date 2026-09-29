package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultMilestones;
import kotlin.Metadata;
import p250lp.InterfaceC7426c;
import p250lp.InterfaceC7428e;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m13365d2 = {"Lwh/h;", "", "", "language", "Lcom/lingq/shared/network/result/ResultMilestones;", "a", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "slug", "Lso/y;", "b", "(Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9940h {
    @InterfaceC7429f("api/v3/{language}/milestones/")
    /* JADX INFO: renamed from: a */
    Object m18487a(@InterfaceC7442s("language") String str, InterfaceC9968c<? super ResultMilestones> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v3/{language}/milestones/badges/")
    /* JADX INFO: renamed from: b */
    Object m18488b(@InterfaceC7442s("language") String str, @InterfaceC7426c("slug") String str2, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
