package p000;

import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class kx5 implements cl1 {

    /* JADX INFO: renamed from: a */
    public final MergePaths$MergePathsMode f48542a;

    /* JADX INFO: renamed from: b */
    public final boolean f48543b;

    public kx5(String str, MergePaths$MergePathsMode mergePaths$MergePathsMode, boolean z) {
        this.f48542a = mergePaths$MergePathsMode;
        this.f48543b = z;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: a */
    public final qk1 mo403a(C0868b c0868b, gl5 gl5Var, o90 o90Var) {
        if (((HashSet) c0868b.f10601H.f65802b).contains(LottieFeatureFlag.MergePathsApi19)) {
            return new mx5(this);
        }
        tj5.m22151c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f48542a + '}';
    }
}
