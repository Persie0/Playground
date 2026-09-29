package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m28 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f50473b;

    public /* synthetic */ m28(RecyclerView recyclerView, int i) {
        this.f50472a = i;
        this.f50473b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f50472a;
        RecyclerView recyclerView = this.f50473b;
        switch (i) {
            case 0:
                if (recyclerView.f6627P && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f6623N) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.f6633S) {
                        recyclerView.f6631R = true;
                    } else {
                        recyclerView.m2753p();
                    }
                    break;
                }
                break;
            default:
                v28 v28Var = recyclerView.f6664k0;
                if (v28Var != null) {
                    a72 a72Var = (a72) v28Var;
                    long j = a72Var.f64745d;
                    ArrayList<o38> arrayList = a72Var.f307h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = a72Var.f309j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = a72Var.f310k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = a72Var.f308i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (o38 o38Var : arrayList) {
                            View view = o38Var.f53781a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            a72Var.f316q.add(o38Var);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new x62(a72Var, o38Var, viewPropertyAnimatorAnimate, view, 2)).start();
                            arrayList4 = arrayList4;
                            arrayList = arrayList;
                        }
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = arrayList4;
                        arrayList5.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList2);
                            a72Var.f312m.add(arrayList7);
                            arrayList2.clear();
                            gvb gvbVar = new gvb(a72Var, arrayList7, false, 2);
                            if (zIsEmpty) {
                                gvbVar.run();
                            } else {
                                View view2 = ((z62) arrayList7.get(0)).f70979a.f53781a;
                                WeakHashMap weakHashMap = dta.f36217a;
                                view2.postOnAnimationDelayed(gvbVar, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList3);
                            a72Var.f313n.add(arrayList8);
                            arrayList3.clear();
                            kj3 kj3Var = new kj3(a72Var, arrayList8, false, 3);
                            if (zIsEmpty) {
                                kj3Var.run();
                            } else {
                                View view3 = ((y62) arrayList8.get(0)).f69356a.f53781a;
                                WeakHashMap weakHashMap2 = dta.f36217a;
                                view3.postOnAnimationDelayed(kj3Var, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.addAll(arrayList6);
                            a72Var.f311l.add(arrayList9);
                            arrayList6.clear();
                            u62 u62Var = new u62(0, a72Var, arrayList9);
                            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                u62Var.run();
                                z = false;
                            } else {
                                if (zIsEmpty) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? a72Var.f64746e : 0L, zIsEmpty3 ? 0L : a72Var.f64747f) + j;
                                z = false;
                                View view4 = ((o38) arrayList9.get(0)).f53781a;
                                WeakHashMap weakHashMap3 = dta.f36217a;
                                view4.postOnAnimationDelayed(u62Var, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.f6614I0 = z;
                break;
        }
    }
}
