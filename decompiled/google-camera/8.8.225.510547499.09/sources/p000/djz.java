package p000;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djz {

    /* JADX INFO: renamed from: a */
    private static final nbh f11841a = nbh.m17259h("com/google/android/apps/camera/data/MarsStoreDataLoader");

    /* JADX INFO: renamed from: b */
    private final ContentResolver f11842b;

    public djz(ContentResolver contentResolver) {
        this.f11842b = contentResolver;
    }

    /* JADX INFO: renamed from: a */
    public final Map m6273a(List list) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            arrayList.add(ContentProviderOperation.newAssertQuery(uri).withValue("_id", uri.getLastPathSegment()).build());
        }
        HashMap map = new HashMap();
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = this.f11842b.applyBatch("com.google.android.libraries.photos.api.mars", arrayList);
            for (int i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                map.put(arrayList.get(i).getUri(), Boolean.valueOf(((Integer) Optional.ofNullable(contentProviderResultArrApplyBatch[i].count).orElse(0)).intValue() > 0));
            }
        } catch (OperationApplicationException | RemoteException e) {
            ((nbe) ((nbe) ((nbe) f11841a.m17251b()).mo17283h(e)).mo17276G((char) 934)).mo17290o("Failed to query for mars items.");
        }
        return map;
    }
}
