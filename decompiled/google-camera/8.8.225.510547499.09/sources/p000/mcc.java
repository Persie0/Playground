package p000;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcc extends ayl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mca f39931a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mbl f39932b;

    public mcc(mca mcaVar, mbl mblVar) {
        this.f39931a = mcaVar;
        this.f39932b = mblVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, oju] */
    @Override // p000.ayl
    /* JADX INFO: renamed from: a */
    public final ayb mo2093a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        if (!ooc.m18737c(str, F250Worker.class.getName())) {
            if (!ooc.m18737c(str, F250AutoWorker.class.getName())) {
                return null;
            }
            mbl mblVar = this.f39932b;
            ksi ksiVar = (ksi) mblVar.f39818c.get();
            ksiVar.getClass();
            mav mavVar = (mav) mblVar.f39819d.get();
            mavVar.getClass();
            lxn lxnVar = (lxn) mblVar.f39820e.get();
            lxnVar.getClass();
            mbe mbeVarM16296a = ((mbf) mblVar.f39816a).get();
            lwz lwzVar = (lwz) mblVar.f39817b.get();
            lwzVar.getClass();
            mat matVar = (mat) mblVar.f39821f.get();
            matVar.getClass();
            oqo oqoVar = (oqo) mblVar.f39822g.get();
            oqoVar.getClass();
            Context context2 = (Context) mblVar.f39823h.get();
            context2.getClass();
            return new F250AutoWorker(ksiVar, mavVar, lxnVar, mbeVarM16296a, lwzVar, matVar, oqoVar, context2, workerParameters);
        }
        mca mcaVar = this.f39931a;
        ksi ksiVar2 = (ksi) mcaVar.f39913a.get();
        ksiVar2.getClass();
        lzh lzhVar = (lzh) mcaVar.f39914b.get();
        lzhVar.getClass();
        lxs lxsVar = (lxs) mcaVar.f39915c.get();
        lxsVar.getClass();
        mdc mdcVar = (mdc) mcaVar.f39916d.get();
        mdcVar.getClass();
        mav mavVar2 = (mav) mcaVar.f39917e.get();
        mavVar2.getClass();
        mbb mbbVarM16294a = ((mbc) mcaVar.f39918f).get();
        Integer num = (Integer) mcaVar.f39919g.get();
        num.getClass();
        int iIntValue = num.intValue();
        oqo oqoVar2 = (oqo) mcaVar.f39920h.get();
        oqoVar2.getClass();
        Context context3 = (Context) mcaVar.f39921i.get();
        context3.getClass();
        return new F250Worker(ksiVar2, lzhVar, lxsVar, mdcVar, mavVar2, mbbVarM16294a, iIntValue, oqoVar2, context3, workerParameters);
    }
}
