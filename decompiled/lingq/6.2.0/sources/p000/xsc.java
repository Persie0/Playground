package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.MilestoneEntity;
import com.lingq.core.network.api.result.ResultMilestone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xsc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68671a = new C0282a(1104599196, false, new he1(22));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68672b = new C0282a(1014926789, false, new he1(23));

    /* JADX INFO: renamed from: a */
    public static final MilestoneEntity m24663a(ResultMilestone resultMilestone, String str) {
        resultMilestone.getClass();
        str.getClass();
        return new MilestoneEntity(resultMilestone.f21328c, vz1.m23629f(str, resultMilestone.f21326a), str, resultMilestone.f21326a, resultMilestone.f21327b, resultMilestone.f21329d, resultMilestone.m8374a());
    }
}
