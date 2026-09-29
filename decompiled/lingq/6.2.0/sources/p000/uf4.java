package p000;

import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.LingQDatabase_Impl;
import com.lingq.core.database.entity.C1325a0;
import com.lingq.core.database.entity.C1346l;
import com.lingq.core.database.entity.C1350n;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.database.entity.LanguageProgressEntity;
import com.lingq.core.database.entity.LibraryShelfEntity;
import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.C1425e;
import com.lingq.core.domain.model.language.C1427g;
import com.lingq.core.domain.model.language.C1431k;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageProgress;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores$$serializer;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.C1465g;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.C1470l;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab$$serializer;
import com.lingq.core.domain.model.library.Resources;
import com.lingq.core.domain.model.library.Sort;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63838a;

    public /* synthetic */ uf4(LingQDatabase_Impl lingQDatabase_Impl) {
        this.f63838a = 24;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f63838a) {
            case 0:
                return cg4.f10014b;
            case 1:
                return ag4.f600a.getDescriptor();
            case 2:
                return gg4.f40769a.getDescriptor();
            case 3:
                return hf4.f42301b;
            case 4:
                C1425e c1425e = Language.Companion;
                return new C2978ev(sk9.f60959a);
            case 5:
                C1425e c1425e2 = Language.Companion;
                return new C2978ev(sk9.f60959a);
            case 6:
                C1425e c1425e3 = Language.Companion;
                return new C2978ev(sk9.f60959a);
            case 7:
                C1346l c1346l = LanguageContextEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 8:
                C1346l c1346l2 = LanguageContextEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 9:
                C1346l c1346l3 = LanguageContextEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 10:
                C1427g c1427g = LanguageProgress.Companion;
                return new C2978ev(sk9.f60959a);
            case 11:
                C1350n c1350n = LanguageProgressEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 12:
                C1431k c1431k = LanguageStudyStats.Companion;
                return new C2978ev(StudyStatsScores$$serializer.INSTANCE);
            case 13:
                return new C0129b(0, 0);
            case 14:
                return new C0144d(new int[]{0}, new int[]{0});
            case 15:
                C1465g c1465g = LibraryItem.Companion;
                return new C2978ev(sk9.f60959a);
            case 16:
                C1469k c1469k = LibrarySearchQuery.Companion;
                Resources[] resourcesArrValues = Resources.values();
                resourcesArrValues.getClass();
                return new je5(new zs2("com.lingq.core.domain.model.library.Resources", resourcesArrValues), lf0.f49579a);
            case 17:
                C1469k c1469k2 = LibrarySearchQuery.Companion;
                LearningLevel[] learningLevelArrValues = LearningLevel.values();
                learningLevelArrValues.getClass();
                return new je5(new zs2("com.lingq.core.domain.model.LearningLevel", learningLevelArrValues), lf0.f49579a);
            case 18:
                C1469k c1469k3 = LibrarySearchQuery.Companion;
                Sort[] sortArrValues = Sort.values();
                sortArrValues.getClass();
                return new zs2("com.lingq.core.domain.model.library.Sort", sortArrValues);
            case 19:
                C1469k c1469k4 = LibrarySearchQuery.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1469k c1469k5 = LibrarySearchQuery.Companion;
                ContentType[] contentTypeArrValues = ContentType.values();
                contentTypeArrValues.getClass();
                return new zs2("com.lingq.core.domain.model.ContentType", contentTypeArrValues);
            case 21:
                C1469k c1469k6 = LibrarySearchQuery.Companion;
                Accent[] accentArrValues = Accent.values();
                accentArrValues.getClass();
                return new C2978ev(new zs2("com.lingq.core.domain.model.library.Accent", accentArrValues));
            case 22:
                C1470l c1470l = LibraryShelf.Companion;
                return new C2978ev(LibraryTab$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1325a0 c1325a0 = LibraryShelfEntity.Companion;
                return new C2978ev(LibraryTab$$serializer.INSTANCE);
            case 24:
                return new x27();
            case 25:
                zf1 zf1Var = qh5.f57783a;
                return null;
            case 26:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zf1 zf1Var2 = hi5.f42404a;
                return null;
            case 28:
                vh9 vh9Var = ki5.f47345a;
                return s46.f60288c;
            default:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
        }
    }

    public /* synthetic */ uf4(int i) {
        this.f63838a = i;
    }
}
