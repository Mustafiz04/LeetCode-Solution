class Solution {
    public class BuildingPoint implements Comparator<BuildingPoint> {
         int x;
         int height;
         boolean isStart;
 
         BuildingPoint(int x, int height, boolean isStart){
             this.x = x;
             this.height = height;
             this.isStart = isStart;
         }
 
         BuildingPoint(){
 
         }
         
         @Override
         public int compare(BuildingPoint b1, BuildingPoint b2){
             if(b1.x == b2.x){
                 // b1 b2 -> b2 b1 if height of b2 > b1
                 if(b1.isStart && b2.isStart) return b2.height - b1.height;
                     //Always have start before end
                 else if(!b1.isStart && b2.isStart) return 1;
                 else if(b1.isStart && !b2.isStart) return -1;
                 else if(!b1.isStart && !b2.isStart) return b1.height - b2.height;
             }
             return b1.x - b2.x;
         }
     }
 
     public List<List<Integer>> getSkyline(int[][] buildings) {
         BuildingPoint[] buildingPoints = new BuildingPoint[buildings.length*2];
         int k=0;
         for(int[] building : buildings){
             BuildingPoint start = new BuildingPoint(building[0],building[2],true);
             buildingPoints[k++] = start;
             BuildingPoint end = new BuildingPoint(building[1],building[2],false);
             buildingPoints[k++] = end;
         }
         Arrays.sort(buildingPoints,new BuildingPoint());
         List<List<Integer>> result = new ArrayList<>();
 
         //To show height and count of heights
         //max value first comparator applied
         TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
         int max = 0;
         map.put(0,0);
 
         for(BuildingPoint buildingPoint : buildingPoints){
             if(buildingPoint.isStart)
                 map.compute(buildingPoint.height,(key,value) -> (value==null)?1:value+1);
             else {
                 map.compute(buildingPoint.height,(key,value) ->{
                     if(value==1) return null;
                     value = value-1;
                     return value;
                 });
             }
              if(map.firstKey() != max){
                  max = map.firstKey();
                  result.add(Arrays.asList(buildingPoint.x,map.firstKey()));
                 
             }
         }
 
         return result;
 
     }
 }